package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimExaminationResults;
import cn.ibizlab.ehr.webapi.dto.PimExaminationResultsDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimExaminationResultsMappingImpl implements PimExaminationResultsMapping {

    @Override
    public PimExaminationResults toDomain(PimExaminationResultsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimExaminationResults pimExaminationResults = new PimExaminationResults();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimExaminationResults.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimExaminationResults.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPj() != null ) {
            pimExaminationResults.setPj( dto.getPj() );
        }
        if ( dto.getPimexaminationresultsname() != null ) {
            pimExaminationResults.setPimexaminationresultsname( dto.getPimexaminationresultsname() );
        }
        if ( dto.getFs() != null ) {
            pimExaminationResults.setFs( dto.getFs() );
        }
        if ( dto.getQssj() != null ) {
            pimExaminationResults.setQssj( dto.getQssj() );
        }
        if ( dto.getJssj() != null ) {
            pimExaminationResults.setJssj( dto.getJssj() );
        }
        if ( dto.getYgbh() != null ) {
            pimExaminationResults.setYgbh( dto.getYgbh() );
        }
        if ( dto.getCreateman() != null ) {
            pimExaminationResults.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimExaminationResults.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimExaminationResults.setEnable( dto.getEnable() );
        }
        if ( dto.getPimexaminationresultsid() != null ) {
            pimExaminationResults.setPimexaminationresultsid( dto.getPimexaminationresultsid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimExaminationResults.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimExaminationResults.setUpdatedate( dto.getUpdatedate() );
        }

        return pimExaminationResults;
    }

    @Override
    public PimExaminationResultsDTO toDto(PimExaminationResults entity) {
        if ( entity == null ) {
            return null;
        }

        PimExaminationResultsDTO pimExaminationResultsDTO = new PimExaminationResultsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimExaminationResultsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimExaminationResultsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPj() != null ) {
            pimExaminationResultsDTO.setPj( entity.getPj() );
        }
        if ( entity.getPimexaminationresultsname() != null ) {
            pimExaminationResultsDTO.setPimexaminationresultsname( entity.getPimexaminationresultsname() );
        }
        if ( entity.getFs() != null ) {
            pimExaminationResultsDTO.setFs( entity.getFs() );
        }
        if ( entity.getQssj() != null ) {
            pimExaminationResultsDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getJssj() != null ) {
            pimExaminationResultsDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getYgbh() != null ) {
            pimExaminationResultsDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getCreateman() != null ) {
            pimExaminationResultsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimExaminationResultsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimExaminationResultsDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPimexaminationresultsid() != null ) {
            pimExaminationResultsDTO.setPimexaminationresultsid( entity.getPimexaminationresultsid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimExaminationResultsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimExaminationResultsDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pimExaminationResultsDTO;
    }

    @Override
    public List<PimExaminationResults> toDomain(List<PimExaminationResultsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimExaminationResults> list = new ArrayList<PimExaminationResults>( dtoList.size() );
        for ( PimExaminationResultsDTO pimExaminationResultsDTO : dtoList ) {
            list.add( toDomain( pimExaminationResultsDTO ) );
        }

        return list;
    }

    @Override
    public List<PimExaminationResultsDTO> toDto(List<PimExaminationResults> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimExaminationResultsDTO> list = new ArrayList<PimExaminationResultsDTO>( entityList.size() );
        for ( PimExaminationResults pimExaminationResults : entityList ) {
            list.add( toDto( pimExaminationResults ) );
        }

        return list;
    }
}
