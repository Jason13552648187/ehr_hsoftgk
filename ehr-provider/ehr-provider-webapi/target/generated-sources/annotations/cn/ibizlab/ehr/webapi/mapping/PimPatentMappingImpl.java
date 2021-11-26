package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimPatent;
import cn.ibizlab.ehr.webapi.dto.PimPatentDTO;
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
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimPatentMappingImpl implements PimPatentMapping {

    @Override
    public PimPatent toDomain(PimPatentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimPatent pimPatent = new PimPatent();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimPatent.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimPatent.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZlh() != null ) {
            pimPatent.setZlh( dto.getZlh() );
        }
        if ( dto.getJlss() != null ) {
            pimPatent.setJlss( dto.getJlss() );
        }
        if ( dto.getZlhqsj() != null ) {
            pimPatent.setZlhqsj( dto.getZlhqsj() );
        }
        if ( dto.getJlspzt() != null ) {
            pimPatent.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getJlczz() != null ) {
            pimPatent.setJlczz( dto.getJlczz() );
        }
        if ( dto.getPimpatentname() != null ) {
            pimPatent.setPimpatentname( dto.getPimpatentname() );
        }
        if ( dto.getJlglbh() != null ) {
            pimPatent.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getReason() != null ) {
            pimPatent.setReason( dto.getReason() );
        }
        if ( dto.getEnclolure() != null ) {
            pimPatent.setEnclolure( dto.getEnclolure() );
        }
        if ( dto.getZlpzgb() != null ) {
            pimPatent.setZlpzgb( dto.getZlpzgb() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimPatent.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimPatent.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpatentid() != null ) {
            pimPatent.setPimpatentid( dto.getPimpatentid() );
        }
        if ( dto.getOrgid() != null ) {
            pimPatent.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimPatent.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getEnable() != null ) {
            pimPatent.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            pimPatent.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimPatent.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimPatent.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimPatent.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getYgbh() != null ) {
            pimPatent.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimPatent.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimPatent.setOrmorgid( dto.getOrmorgid() );
        }

        return pimPatent;
    }

    @Override
    public PimPatentDTO toDto(PimPatent entity) {
        if ( entity == null ) {
            return null;
        }

        PimPatentDTO pimPatentDTO = new PimPatentDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimPatentDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimPatentDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZlh() != null ) {
            pimPatentDTO.setZlh( entity.getZlh() );
        }
        if ( entity.getJlss() != null ) {
            pimPatentDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getZlhqsj() != null ) {
            pimPatentDTO.setZlhqsj( entity.getZlhqsj() );
        }
        if ( entity.getJlspzt() != null ) {
            pimPatentDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getJlczz() != null ) {
            pimPatentDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getPimpatentname() != null ) {
            pimPatentDTO.setPimpatentname( entity.getPimpatentname() );
        }
        if ( entity.getJlglbh() != null ) {
            pimPatentDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getReason() != null ) {
            pimPatentDTO.setReason( entity.getReason() );
        }
        if ( entity.getEnclolure() != null ) {
            pimPatentDTO.setEnclolure( entity.getEnclolure() );
        }
        if ( entity.getZlpzgb() != null ) {
            pimPatentDTO.setZlpzgb( entity.getZlpzgb() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimPatentDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimPatentDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpatentid() != null ) {
            pimPatentDTO.setPimpatentid( entity.getPimpatentid() );
        }
        if ( entity.getOrgid() != null ) {
            pimPatentDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimPatentDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getEnable() != null ) {
            pimPatentDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            pimPatentDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimPatentDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimPatentDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimPatentDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getYgbh() != null ) {
            pimPatentDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimPatentDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimPatentDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return pimPatentDTO;
    }

    @Override
    public List<PimPatent> toDomain(List<PimPatentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimPatent> list = new ArrayList<PimPatent>( dtoList.size() );
        for ( PimPatentDTO pimPatentDTO : dtoList ) {
            list.add( toDomain( pimPatentDTO ) );
        }

        return list;
    }

    @Override
    public List<PimPatentDTO> toDto(List<PimPatent> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimPatentDTO> list = new ArrayList<PimPatentDTO>( entityList.size() );
        for ( PimPatent pimPatent : entityList ) {
            list.add( toDto( pimPatent ) );
        }

        return list;
    }
}
