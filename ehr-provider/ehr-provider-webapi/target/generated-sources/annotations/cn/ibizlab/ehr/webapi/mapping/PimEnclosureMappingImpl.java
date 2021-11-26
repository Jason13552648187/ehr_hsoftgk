package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimEnclosure;
import cn.ibizlab.ehr.webapi.dto.PimEnclosureDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimEnclosureMappingImpl implements PimEnclosureMapping {

    @Override
    public PimEnclosure toDomain(PimEnclosureDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimEnclosure pimEnclosure = new PimEnclosure();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimEnclosure.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimEnclosure.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFj() != null ) {
            pimEnclosure.setFj( dto.getFj() );
        }
        if ( dto.getPimenclosurename() != null ) {
            pimEnclosure.setPimenclosurename( dto.getPimenclosurename() );
        }
        if ( dto.getFjfl() != null ) {
            pimEnclosure.setFjfl( dto.getFjfl() );
        }
        if ( dto.getFjlj() != null ) {
            pimEnclosure.setFjlj( dto.getFjlj() );
        }
        if ( dto.getUserstate() != null ) {
            pimEnclosure.setUserstate( dto.getUserstate() );
        }
        if ( dto.getFjkz() != null ) {
            pimEnclosure.setFjkz( dto.getFjkz() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimEnclosure.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrgid() != null ) {
            pimEnclosure.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimEnclosure.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimEnclosure.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pimEnclosure.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimenclosureid() != null ) {
            pimEnclosure.setPimenclosureid( dto.getPimenclosureid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimEnclosure.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimEnclosure.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimEnclosure.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimEnclosure.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimEnclosure.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimEnclosure.setOrmorgid( dto.getOrmorgid() );
        }

        return pimEnclosure;
    }

    @Override
    public PimEnclosureDTO toDto(PimEnclosure entity) {
        if ( entity == null ) {
            return null;
        }

        PimEnclosureDTO pimEnclosureDTO = new PimEnclosureDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimEnclosureDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimEnclosureDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFj() != null ) {
            pimEnclosureDTO.setFj( entity.getFj() );
        }
        if ( entity.getPimenclosurename() != null ) {
            pimEnclosureDTO.setPimenclosurename( entity.getPimenclosurename() );
        }
        if ( entity.getFjfl() != null ) {
            pimEnclosureDTO.setFjfl( entity.getFjfl() );
        }
        if ( entity.getFjlj() != null ) {
            pimEnclosureDTO.setFjlj( entity.getFjlj() );
        }
        if ( entity.getUserstate() != null ) {
            pimEnclosureDTO.setUserstate( entity.getUserstate() );
        }
        if ( entity.getFjkz() != null ) {
            pimEnclosureDTO.setFjkz( entity.getFjkz() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimEnclosureDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrgid() != null ) {
            pimEnclosureDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimEnclosureDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimEnclosureDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pimEnclosureDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimenclosureid() != null ) {
            pimEnclosureDTO.setPimenclosureid( entity.getPimenclosureid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimEnclosureDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimEnclosureDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimEnclosureDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimEnclosureDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimEnclosureDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimEnclosureDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return pimEnclosureDTO;
    }

    @Override
    public List<PimEnclosure> toDomain(List<PimEnclosureDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimEnclosure> list = new ArrayList<PimEnclosure>( dtoList.size() );
        for ( PimEnclosureDTO pimEnclosureDTO : dtoList ) {
            list.add( toDomain( pimEnclosureDTO ) );
        }

        return list;
    }

    @Override
    public List<PimEnclosureDTO> toDto(List<PimEnclosure> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimEnclosureDTO> list = new ArrayList<PimEnclosureDTO>( entityList.size() );
        for ( PimEnclosure pimEnclosure : entityList ) {
            list.add( toDto( pimEnclosure ) );
        }

        return list;
    }
}
