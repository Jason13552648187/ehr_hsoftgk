package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimVacation;
import cn.ibizlab.ehr.webapi.dto.PimVacationDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimVacationMappingImpl implements PimVacationMapping {

    @Override
    public PimVacation toDomain(PimVacationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimVacation pimVacation = new PimVacation();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimVacation.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimVacation.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimvacationname() != null ) {
            pimVacation.setPimvacationname( dto.getPimvacationname() );
        }
        if ( dto.getXjts() != null ) {
            pimVacation.setXjts( dto.getXjts() );
        }
        if ( dto.getXjjssj() != null ) {
            pimVacation.setXjjssj( dto.getXjjssj() );
        }
        if ( dto.getXjkssj() != null ) {
            pimVacation.setXjkssj( dto.getXjkssj() );
        }
        if ( dto.getXjlx() != null ) {
            pimVacation.setXjlx( dto.getXjlx() );
        }
        if ( dto.getFj() != null ) {
            pimVacation.setFj( dto.getFj() );
        }
        if ( dto.getBz() != null ) {
            pimVacation.setBz( dto.getBz() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimVacation.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimVacation.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimVacation.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimVacation.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimVacation.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimvacationid() != null ) {
            pimVacation.setPimvacationid( dto.getPimvacationid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimVacation.setPimpersonname( dto.getPimpersonname() );
        }

        return pimVacation;
    }

    @Override
    public PimVacationDTO toDto(PimVacation entity) {
        if ( entity == null ) {
            return null;
        }

        PimVacationDTO pimVacationDTO = new PimVacationDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimVacationDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimVacationDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimvacationname() != null ) {
            pimVacationDTO.setPimvacationname( entity.getPimvacationname() );
        }
        if ( entity.getXjts() != null ) {
            pimVacationDTO.setXjts( entity.getXjts() );
        }
        if ( entity.getXjjssj() != null ) {
            pimVacationDTO.setXjjssj( entity.getXjjssj() );
        }
        if ( entity.getXjkssj() != null ) {
            pimVacationDTO.setXjkssj( entity.getXjkssj() );
        }
        if ( entity.getXjlx() != null ) {
            pimVacationDTO.setXjlx( entity.getXjlx() );
        }
        if ( entity.getFj() != null ) {
            pimVacationDTO.setFj( entity.getFj() );
        }
        if ( entity.getBz() != null ) {
            pimVacationDTO.setBz( entity.getBz() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimVacationDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimVacationDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimVacationDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimVacationDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimVacationDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimvacationid() != null ) {
            pimVacationDTO.setPimvacationid( entity.getPimvacationid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimVacationDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pimVacationDTO;
    }

    @Override
    public List<PimVacation> toDomain(List<PimVacationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimVacation> list = new ArrayList<PimVacation>( dtoList.size() );
        for ( PimVacationDTO pimVacationDTO : dtoList ) {
            list.add( toDomain( pimVacationDTO ) );
        }

        return list;
    }

    @Override
    public List<PimVacationDTO> toDto(List<PimVacation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimVacationDTO> list = new ArrayList<PimVacationDTO>( entityList.size() );
        for ( PimVacation pimVacation : entityList ) {
            list.add( toDto( pimVacation ) );
        }

        return list;
    }
}
