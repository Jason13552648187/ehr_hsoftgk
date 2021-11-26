package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimQualMajor;
import cn.ibizlab.ehr.webapi.dto.PimQualMajorDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimQualMajorMappingImpl implements PimQualMajorMapping {

    @Override
    public PimQualMajor toDomain(PimQualMajorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimQualMajor pimQualMajor = new PimQualMajor();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimQualMajor.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimQualMajor.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getGwzs() != null ) {
            pimQualMajor.setGwzs( dto.getGwzs() );
        }
        if ( dto.getGwtype() != null ) {
            pimQualMajor.setGwtype( dto.getGwtype() );
        }
        if ( dto.getZyjszw() != null ) {
            pimQualMajor.setZyjszw( dto.getZyjszw() );
        }
        if ( dto.getQuamajor() != null ) {
            pimQualMajor.setQuamajor( dto.getQuamajor() );
        }
        if ( dto.getGwlx() != null ) {
            pimQualMajor.setGwlx( dto.getGwlx() );
        }
        if ( dto.getQualevel() != null ) {
            pimQualMajor.setQualevel( dto.getQualevel() );
        }
        if ( dto.getPimqualmajorname() != null ) {
            pimQualMajor.setPimqualmajorname( dto.getPimqualmajorname() );
        }
        if ( dto.getProfessionaltype() != null ) {
            pimQualMajor.setProfessionaltype( dto.getProfessionaltype() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimQualMajor.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimqualtypeid() != null ) {
            pimQualMajor.setPimqualtypeid( dto.getPimqualtypeid() );
        }
        if ( dto.getCreateman() != null ) {
            pimQualMajor.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimQualMajor.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pimQualMajor.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEnable() != null ) {
            pimQualMajor.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimQualMajor.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimQualMajor.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimqualmajorid() != null ) {
            pimQualMajor.setPimqualmajorid( dto.getPimqualmajorid() );
        }
        if ( dto.getZyzgzy() != null ) {
            pimQualMajor.setZyzgzy( dto.getZyzgzy() );
        }
        if ( dto.getPimqualtypename() != null ) {
            pimQualMajor.setPimqualtypename( dto.getPimqualtypename() );
        }

        return pimQualMajor;
    }

    @Override
    public PimQualMajorDTO toDto(PimQualMajor entity) {
        if ( entity == null ) {
            return null;
        }

        PimQualMajorDTO pimQualMajorDTO = new PimQualMajorDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimQualMajorDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimQualMajorDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getGwzs() != null ) {
            pimQualMajorDTO.setGwzs( entity.getGwzs() );
        }
        if ( entity.getGwtype() != null ) {
            pimQualMajorDTO.setGwtype( entity.getGwtype() );
        }
        if ( entity.getZyjszw() != null ) {
            pimQualMajorDTO.setZyjszw( entity.getZyjszw() );
        }
        if ( entity.getQuamajor() != null ) {
            pimQualMajorDTO.setQuamajor( entity.getQuamajor() );
        }
        if ( entity.getGwlx() != null ) {
            pimQualMajorDTO.setGwlx( entity.getGwlx() );
        }
        if ( entity.getQualevel() != null ) {
            pimQualMajorDTO.setQualevel( entity.getQualevel() );
        }
        if ( entity.getPimqualmajorname() != null ) {
            pimQualMajorDTO.setPimqualmajorname( entity.getPimqualmajorname() );
        }
        if ( entity.getProfessionaltype() != null ) {
            pimQualMajorDTO.setProfessionaltype( entity.getProfessionaltype() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimQualMajorDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimqualtypeid() != null ) {
            pimQualMajorDTO.setPimqualtypeid( entity.getPimqualtypeid() );
        }
        if ( entity.getCreateman() != null ) {
            pimQualMajorDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimQualMajorDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pimQualMajorDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEnable() != null ) {
            pimQualMajorDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimQualMajorDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimQualMajorDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimqualmajorid() != null ) {
            pimQualMajorDTO.setPimqualmajorid( entity.getPimqualmajorid() );
        }
        if ( entity.getZyzgzy() != null ) {
            pimQualMajorDTO.setZyzgzy( entity.getZyzgzy() );
        }
        if ( entity.getPimqualtypename() != null ) {
            pimQualMajorDTO.setPimqualtypename( entity.getPimqualtypename() );
        }

        return pimQualMajorDTO;
    }

    @Override
    public List<PimQualMajor> toDomain(List<PimQualMajorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimQualMajor> list = new ArrayList<PimQualMajor>( dtoList.size() );
        for ( PimQualMajorDTO pimQualMajorDTO : dtoList ) {
            list.add( toDomain( pimQualMajorDTO ) );
        }

        return list;
    }

    @Override
    public List<PimQualMajorDTO> toDto(List<PimQualMajor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimQualMajorDTO> list = new ArrayList<PimQualMajorDTO>( entityList.size() );
        for ( PimQualMajor pimQualMajor : entityList ) {
            list.add( toDto( pimQualMajor ) );
        }

        return list;
    }
}
