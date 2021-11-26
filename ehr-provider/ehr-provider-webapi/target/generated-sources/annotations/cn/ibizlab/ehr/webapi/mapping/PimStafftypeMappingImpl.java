package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimStafftype;
import cn.ibizlab.ehr.webapi.dto.PimStafftypeDTO;
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
public class PimStafftypeMappingImpl implements PimStafftypeMapping {

    @Override
    public PimStafftype toDomain(PimStafftypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimStafftype pimStafftype = new PimStafftype();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimStafftype.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimStafftype.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getShgz() != null ) {
            pimStafftype.setShgz( dto.getShgz() );
        }
        if ( dto.getSbm() != null ) {
            pimStafftype.setSbm( dto.getSbm() );
        }
        if ( dto.getPimstafftypename() != null ) {
            pimStafftype.setPimstafftypename( dto.getPimstafftypename() );
        }
        if ( dto.getUpdateman() != null ) {
            pimStafftype.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimstafftypeid() != null ) {
            pimStafftype.setPimstafftypeid( dto.getPimstafftypeid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimStafftype.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pimStafftype.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimStafftype.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            pimStafftype.setEnable( dto.getEnable() );
        }

        return pimStafftype;
    }

    @Override
    public PimStafftypeDTO toDto(PimStafftype entity) {
        if ( entity == null ) {
            return null;
        }

        PimStafftypeDTO pimStafftypeDTO = new PimStafftypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimStafftypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimStafftypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getShgz() != null ) {
            pimStafftypeDTO.setShgz( entity.getShgz() );
        }
        if ( entity.getSbm() != null ) {
            pimStafftypeDTO.setSbm( entity.getSbm() );
        }
        if ( entity.getPimstafftypename() != null ) {
            pimStafftypeDTO.setPimstafftypename( entity.getPimstafftypename() );
        }
        if ( entity.getUpdateman() != null ) {
            pimStafftypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimstafftypeid() != null ) {
            pimStafftypeDTO.setPimstafftypeid( entity.getPimstafftypeid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimStafftypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pimStafftypeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimStafftypeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            pimStafftypeDTO.setEnable( entity.getEnable() );
        }

        return pimStafftypeDTO;
    }

    @Override
    public List<PimStafftype> toDomain(List<PimStafftypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimStafftype> list = new ArrayList<PimStafftype>( dtoList.size() );
        for ( PimStafftypeDTO pimStafftypeDTO : dtoList ) {
            list.add( toDomain( pimStafftypeDTO ) );
        }

        return list;
    }

    @Override
    public List<PimStafftypeDTO> toDto(List<PimStafftype> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimStafftypeDTO> list = new ArrayList<PimStafftypeDTO>( entityList.size() );
        for ( PimStafftype pimStafftype : entityList ) {
            list.add( toDto( pimStafftype ) );
        }

        return list;
    }
}
