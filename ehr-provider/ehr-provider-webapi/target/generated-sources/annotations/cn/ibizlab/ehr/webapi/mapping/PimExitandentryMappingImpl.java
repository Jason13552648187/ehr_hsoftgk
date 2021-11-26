package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimExitandentry;
import cn.ibizlab.ehr.webapi.dto.PimExitandentryDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimExitandentryMappingImpl implements PimExitandentryMapping {

    @Override
    public PimExitandentry toDomain(PimExitandentryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimExitandentry pimExitandentry = new PimExitandentry();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimExitandentry.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimExitandentry.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLx() != null ) {
            pimExitandentry.setLx( dto.getLx() );
        }
        if ( dto.getBz() != null ) {
            pimExitandentry.setBz( dto.getBz() );
        }
        if ( dto.getCjsj() != null ) {
            pimExitandentry.setCjsj( dto.getCjsj() );
        }
        if ( dto.getJlss() != null ) {
            pimExitandentry.setJlss( dto.getJlss() );
        }
        if ( dto.getWorkflowstate() != null ) {
            pimExitandentry.setWorkflowstate( dto.getWorkflowstate() );
        }
        if ( dto.getPimexitandentryname() != null ) {
            pimExitandentry.setPimexitandentryname( dto.getPimexitandentryname() );
        }
        if ( dto.getSy() != null ) {
            pimExitandentry.setSy( dto.getSy() );
        }
        if ( dto.getRjsj() != null ) {
            pimExitandentry.setRjsj( dto.getRjsj() );
        }
        if ( dto.getQwfhgj() != null ) {
            pimExitandentry.setQwfhgj( dto.getQwfhgj() );
        }
        if ( dto.getWfresult() != null ) {
            pimExitandentry.setWfresult( dto.getWfresult() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimExitandentry.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrgid() != null ) {
            pimExitandentry.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimExitandentry.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getPimexitandentryid() != null ) {
            pimExitandentry.setPimexitandentryid( dto.getPimexitandentryid() );
        }
        if ( dto.getCreateman() != null ) {
            pimExitandentry.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            pimExitandentry.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            pimExitandentry.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimExitandentry.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pimExitandentry.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimExitandentry.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getZw() != null ) {
            pimExitandentry.setZw( dto.getZw() );
        }
        if ( dto.getYgbh() != null ) {
            pimExitandentry.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimExitandentry.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimExitandentry.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimExitandentry.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getRank() != null ) {
            pimExitandentry.setRank( dto.getRank() );
        }
        if ( dto.getZzdzs() != null ) {
            pimExitandentry.setZzdzs( dto.getZzdzs() );
        }

        return pimExitandentry;
    }

    @Override
    public PimExitandentryDTO toDto(PimExitandentry entity) {
        if ( entity == null ) {
            return null;
        }

        PimExitandentryDTO pimExitandentryDTO = new PimExitandentryDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimExitandentryDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimExitandentryDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLx() != null ) {
            pimExitandentryDTO.setLx( entity.getLx() );
        }
        if ( entity.getBz() != null ) {
            pimExitandentryDTO.setBz( entity.getBz() );
        }
        if ( entity.getCjsj() != null ) {
            pimExitandentryDTO.setCjsj( entity.getCjsj() );
        }
        if ( entity.getJlss() != null ) {
            pimExitandentryDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getWorkflowstate() != null ) {
            pimExitandentryDTO.setWorkflowstate( entity.getWorkflowstate() );
        }
        if ( entity.getPimexitandentryname() != null ) {
            pimExitandentryDTO.setPimexitandentryname( entity.getPimexitandentryname() );
        }
        if ( entity.getSy() != null ) {
            pimExitandentryDTO.setSy( entity.getSy() );
        }
        if ( entity.getRjsj() != null ) {
            pimExitandentryDTO.setRjsj( entity.getRjsj() );
        }
        if ( entity.getQwfhgj() != null ) {
            pimExitandentryDTO.setQwfhgj( entity.getQwfhgj() );
        }
        if ( entity.getWfresult() != null ) {
            pimExitandentryDTO.setWfresult( entity.getWfresult() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimExitandentryDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrgid() != null ) {
            pimExitandentryDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimExitandentryDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getPimexitandentryid() != null ) {
            pimExitandentryDTO.setPimexitandentryid( entity.getPimexitandentryid() );
        }
        if ( entity.getCreateman() != null ) {
            pimExitandentryDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            pimExitandentryDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            pimExitandentryDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimExitandentryDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pimExitandentryDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimExitandentryDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getZw() != null ) {
            pimExitandentryDTO.setZw( entity.getZw() );
        }
        if ( entity.getYgbh() != null ) {
            pimExitandentryDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimExitandentryDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimExitandentryDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimExitandentryDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getRank() != null ) {
            pimExitandentryDTO.setRank( entity.getRank() );
        }
        if ( entity.getZzdzs() != null ) {
            pimExitandentryDTO.setZzdzs( entity.getZzdzs() );
        }

        return pimExitandentryDTO;
    }

    @Override
    public List<PimExitandentry> toDomain(List<PimExitandentryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimExitandentry> list = new ArrayList<PimExitandentry>( dtoList.size() );
        for ( PimExitandentryDTO pimExitandentryDTO : dtoList ) {
            list.add( toDomain( pimExitandentryDTO ) );
        }

        return list;
    }

    @Override
    public List<PimExitandentryDTO> toDto(List<PimExitandentry> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimExitandentryDTO> list = new ArrayList<PimExitandentryDTO>( entityList.size() );
        for ( PimExitandentry pimExitandentry : entityList ) {
            list.add( toDto( pimExitandentry ) );
        }

        return list;
    }
}
