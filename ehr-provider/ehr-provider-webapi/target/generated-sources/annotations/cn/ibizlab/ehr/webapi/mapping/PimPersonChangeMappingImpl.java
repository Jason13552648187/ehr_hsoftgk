package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimPersonChange;
import cn.ibizlab.ehr.webapi.dto.PimPersonChangeDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimPersonChangeMappingImpl implements PimPersonChangeMapping {

    @Override
    public PimPersonChange toDomain(PimPersonChangeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimPersonChange pimPersonChange = new PimPersonChange();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimPersonChange.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimPersonChange.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getCz() != null ) {
            pimPersonChange.setCz( dto.getCz() );
        }
        if ( dto.getCzdxmc() != null ) {
            pimPersonChange.setCzdxmc( dto.getCzdxmc() );
        }
        if ( dto.getJlbh() != null ) {
            pimPersonChange.setJlbh( dto.getJlbh() );
        }
        if ( dto.getCzdxbh() != null ) {
            pimPersonChange.setCzdxbh( dto.getCzdxbh() );
        }
        if ( dto.getSxsj() != null ) {
            pimPersonChange.setSxsj( dto.getSxsj() );
        }
        if ( dto.getZt() != null ) {
            pimPersonChange.setZt( dto.getZt() );
        }
        if ( dto.getFj() != null ) {
            pimPersonChange.setFj( dto.getFj() );
        }
        if ( dto.getReason() != null ) {
            pimPersonChange.setReason( dto.getReason() );
        }
        if ( dto.getBglx() != null ) {
            pimPersonChange.setBglx( dto.getBglx() );
        }
        if ( dto.getBz() != null ) {
            pimPersonChange.setBz( dto.getBz() );
        }
        if ( dto.getBgnr() != null ) {
            pimPersonChange.setBgnr( dto.getBgnr() );
        }
        if ( dto.getBgsj() != null ) {
            pimPersonChange.setBgsj( dto.getBgsj() );
        }
        if ( dto.getPimpersonchangename() != null ) {
            pimPersonChange.setPimpersonchangename( dto.getPimpersonchangename() );
        }
        if ( dto.getSqsj() != null ) {
            pimPersonChange.setSqsj( dto.getSqsj() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimPersonChange.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimPersonChange.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreateman() != null ) {
            pimPersonChange.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimpersonchangeid() != null ) {
            pimPersonChange.setPimpersonchangeid( dto.getPimpersonchangeid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimPersonChange.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimPersonChange.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimPersonChange.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pimPersonChange.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimPersonChange.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimPersonChange.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimPersonChange.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getYgbh() != null ) {
            pimPersonChange.setYgbh( dto.getYgbh() );
        }

        return pimPersonChange;
    }

    @Override
    public PimPersonChangeDTO toDto(PimPersonChange entity) {
        if ( entity == null ) {
            return null;
        }

        PimPersonChangeDTO pimPersonChangeDTO = new PimPersonChangeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimPersonChangeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimPersonChangeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getCz() != null ) {
            pimPersonChangeDTO.setCz( entity.getCz() );
        }
        if ( entity.getCzdxmc() != null ) {
            pimPersonChangeDTO.setCzdxmc( entity.getCzdxmc() );
        }
        if ( entity.getJlbh() != null ) {
            pimPersonChangeDTO.setJlbh( entity.getJlbh() );
        }
        if ( entity.getCzdxbh() != null ) {
            pimPersonChangeDTO.setCzdxbh( entity.getCzdxbh() );
        }
        if ( entity.getSxsj() != null ) {
            pimPersonChangeDTO.setSxsj( entity.getSxsj() );
        }
        if ( entity.getZt() != null ) {
            pimPersonChangeDTO.setZt( entity.getZt() );
        }
        if ( entity.getFj() != null ) {
            pimPersonChangeDTO.setFj( entity.getFj() );
        }
        if ( entity.getReason() != null ) {
            pimPersonChangeDTO.setReason( entity.getReason() );
        }
        if ( entity.getBglx() != null ) {
            pimPersonChangeDTO.setBglx( entity.getBglx() );
        }
        if ( entity.getBz() != null ) {
            pimPersonChangeDTO.setBz( entity.getBz() );
        }
        if ( entity.getBgnr() != null ) {
            pimPersonChangeDTO.setBgnr( entity.getBgnr() );
        }
        if ( entity.getBgsj() != null ) {
            pimPersonChangeDTO.setBgsj( entity.getBgsj() );
        }
        if ( entity.getPimpersonchangename() != null ) {
            pimPersonChangeDTO.setPimpersonchangename( entity.getPimpersonchangename() );
        }
        if ( entity.getSqsj() != null ) {
            pimPersonChangeDTO.setSqsj( entity.getSqsj() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimPersonChangeDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimPersonChangeDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreateman() != null ) {
            pimPersonChangeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimpersonchangeid() != null ) {
            pimPersonChangeDTO.setPimpersonchangeid( entity.getPimpersonchangeid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimPersonChangeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimPersonChangeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimPersonChangeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pimPersonChangeDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimPersonChangeDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimPersonChangeDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimPersonChangeDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getYgbh() != null ) {
            pimPersonChangeDTO.setYgbh( entity.getYgbh() );
        }

        return pimPersonChangeDTO;
    }

    @Override
    public List<PimPersonChange> toDomain(List<PimPersonChangeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimPersonChange> list = new ArrayList<PimPersonChange>( dtoList.size() );
        for ( PimPersonChangeDTO pimPersonChangeDTO : dtoList ) {
            list.add( toDomain( pimPersonChangeDTO ) );
        }

        return list;
    }

    @Override
    public List<PimPersonChangeDTO> toDto(List<PimPersonChange> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimPersonChangeDTO> list = new ArrayList<PimPersonChangeDTO>( entityList.size() );
        for ( PimPersonChange pimPersonChange : entityList ) {
            list.add( toDto( pimPersonChange ) );
        }

        return list;
    }
}
