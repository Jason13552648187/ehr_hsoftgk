package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimDistirbution;
import cn.ibizlab.ehr.webapi.dto.PimDistirbutionDTO;
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
    date = "2021-09-04T00:31:54+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimDistirbutionMappingImpl implements PimDistirbutionMapping {

    @Override
    public PimDistirbution toDomain(PimDistirbutionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimDistirbution pimDistirbution = new PimDistirbution();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimDistirbution.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimDistirbution.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getRzjssj() != null ) {
            pimDistirbution.setRzjssj( dto.getRzjssj() );
        }
        if ( dto.getFpzt() != null ) {
            pimDistirbution.setFpzt( dto.getFpzt() );
        }
        if ( dto.getLogcontent() != null ) {
            pimDistirbution.setLogcontent( dto.getLogcontent() );
        }
        if ( dto.getRzkssj() != null ) {
            pimDistirbution.setRzkssj( dto.getRzkssj() );
        }
        if ( dto.getYzw() != null ) {
            pimDistirbution.setYzw( dto.getYzw() );
        }
        if ( dto.getRecord() != null ) {
            pimDistirbution.setRecord( dto.getRecord() );
        }
        if ( dto.getBz() != null ) {
            pimDistirbution.setBz( dto.getBz() );
        }
        if ( dto.getGzdq() != null ) {
            pimDistirbution.setGzdq( dto.getGzdq() );
        }
        if ( dto.getPimworkhistoryid() != null ) {
            pimDistirbution.setPimworkhistoryid( dto.getPimworkhistoryid() );
        }
        if ( dto.getIsoutrecord() != null ) {
            pimDistirbution.setIsoutrecord( dto.getIsoutrecord() );
        }
        if ( dto.getPimdistirbutionname() != null ) {
            pimDistirbution.setPimdistirbutionname( dto.getPimdistirbutionname() );
        }
        if ( dto.getFplx() != null ) {
            pimDistirbution.setFplx( dto.getFplx() );
        }
        if ( dto.getExperience() != null ) {
            pimDistirbution.setExperience( dto.getExperience() );
        }
        if ( dto.getYdmxid() != null ) {
            pimDistirbution.setYdmxid( dto.getYdmxid() );
        }
        if ( dto.getGzdd() != null ) {
            pimDistirbution.setGzdd( dto.getGzdd() );
        }
        if ( dto.getYgw() != null ) {
            pimDistirbution.setYgw( dto.getYgw() );
        }
        if ( dto.getCfplx() != null ) {
            pimDistirbution.setCfplx( dto.getCfplx() );
        }
        if ( dto.getRank() != null ) {
            pimDistirbution.setRank( dto.getRank() );
        }
        if ( dto.getOrmpostname() != null ) {
            pimDistirbution.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getYzz() != null ) {
            pimDistirbution.setYzz( dto.getYzz() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimDistirbution.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getYgbh() != null ) {
            pimDistirbution.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pimDistirbution.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pimDistirbution.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getYbm() != null ) {
            pimDistirbution.setYbm( dto.getYbm() );
        }
        if ( dto.getYbmid() != null ) {
            pimDistirbution.setYbmid( dto.getYbmid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimDistirbution.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmpostid1() != null ) {
            pimDistirbution.setOrmpostid1( dto.getOrmpostid1() );
        }
        if ( dto.getOrmpostid() != null ) {
            pimDistirbution.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pimDistirbution.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getYzzid() != null ) {
            pimDistirbution.setYzzid( dto.getYzzid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimDistirbution.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimDistirbution.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getSsfw() != null ) {
            pimDistirbution.setSsfw( dto.getSsfw() );
        }
        if ( dto.getEnable() != null ) {
            pimDistirbution.setEnable( dto.getEnable() );
        }
        if ( dto.getPimdistirbutionid() != null ) {
            pimDistirbution.setPimdistirbutionid( dto.getPimdistirbutionid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimDistirbution.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimDistirbution.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimDistirbution.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pimDistirbution.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimDistirbution.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getJdzt() != null ) {
            pimDistirbution.setJdzt( dto.getJdzt() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimDistirbution.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getYgzt() != null ) {
            pimDistirbution.setYgzt( dto.getYgzt() );
        }
        if ( dto.getXb() != null ) {
            pimDistirbution.setXb( dto.getXb() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimDistirbution.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZgcode() != null ) {
            pimDistirbution.setZgcode( dto.getZgcode() );
        }
        if ( dto.getLgnx() != null ) {
            pimDistirbution.setLgnx( dto.getLgnx() );
        }
        if ( dto.getYbmshortname() != null ) {
            pimDistirbution.setYbmshortname( dto.getYbmshortname() );
        }
        if ( dto.getZzmm() != null ) {
            pimDistirbution.setZzmm( dto.getZzmm() );
        }
        if ( dto.getYdzt() != null ) {
            pimDistirbution.setYdzt( dto.getYdzt() );
        }
        if ( dto.getNj() != null ) {
            pimDistirbution.setNj( dto.getNj() );
        }
        if ( dto.getYzzzzdzs() != null ) {
            pimDistirbution.setYzzzzdzs( dto.getYzzzzdzs() );
        }
        if ( dto.getZzdzs() != null ) {
            pimDistirbution.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getShortname() != null ) {
            pimDistirbution.setShortname( dto.getShortname() );
        }
        if ( dto.getOrmpostname1() != null ) {
            pimDistirbution.setOrmpostname1( dto.getOrmpostname1() );
        }

        return pimDistirbution;
    }

    @Override
    public PimDistirbutionDTO toDto(PimDistirbution entity) {
        if ( entity == null ) {
            return null;
        }

        PimDistirbutionDTO pimDistirbutionDTO = new PimDistirbutionDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimDistirbutionDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimDistirbutionDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getRzjssj() != null ) {
            pimDistirbutionDTO.setRzjssj( entity.getRzjssj() );
        }
        if ( entity.getFpzt() != null ) {
            pimDistirbutionDTO.setFpzt( entity.getFpzt() );
        }
        if ( entity.getLogcontent() != null ) {
            pimDistirbutionDTO.setLogcontent( entity.getLogcontent() );
        }
        if ( entity.getRzkssj() != null ) {
            pimDistirbutionDTO.setRzkssj( entity.getRzkssj() );
        }
        if ( entity.getYzw() != null ) {
            pimDistirbutionDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getRecord() != null ) {
            pimDistirbutionDTO.setRecord( entity.getRecord() );
        }
        if ( entity.getBz() != null ) {
            pimDistirbutionDTO.setBz( entity.getBz() );
        }
        if ( entity.getGzdq() != null ) {
            pimDistirbutionDTO.setGzdq( entity.getGzdq() );
        }
        if ( entity.getPimworkhistoryid() != null ) {
            pimDistirbutionDTO.setPimworkhistoryid( entity.getPimworkhistoryid() );
        }
        if ( entity.getIsoutrecord() != null ) {
            pimDistirbutionDTO.setIsoutrecord( entity.getIsoutrecord() );
        }
        if ( entity.getPimdistirbutionname() != null ) {
            pimDistirbutionDTO.setPimdistirbutionname( entity.getPimdistirbutionname() );
        }
        if ( entity.getFplx() != null ) {
            pimDistirbutionDTO.setFplx( entity.getFplx() );
        }
        if ( entity.getExperience() != null ) {
            pimDistirbutionDTO.setExperience( entity.getExperience() );
        }
        if ( entity.getYdmxid() != null ) {
            pimDistirbutionDTO.setYdmxid( entity.getYdmxid() );
        }
        if ( entity.getGzdd() != null ) {
            pimDistirbutionDTO.setGzdd( entity.getGzdd() );
        }
        if ( entity.getYgw() != null ) {
            pimDistirbutionDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getCfplx() != null ) {
            pimDistirbutionDTO.setCfplx( entity.getCfplx() );
        }
        if ( entity.getRank() != null ) {
            pimDistirbutionDTO.setRank( entity.getRank() );
        }
        if ( entity.getOrmpostname() != null ) {
            pimDistirbutionDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getYzz() != null ) {
            pimDistirbutionDTO.setYzz( entity.getYzz() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimDistirbutionDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getYgbh() != null ) {
            pimDistirbutionDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pimDistirbutionDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pimDistirbutionDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getYbm() != null ) {
            pimDistirbutionDTO.setYbm( entity.getYbm() );
        }
        if ( entity.getYbmid() != null ) {
            pimDistirbutionDTO.setYbmid( entity.getYbmid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimDistirbutionDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmpostid1() != null ) {
            pimDistirbutionDTO.setOrmpostid1( entity.getOrmpostid1() );
        }
        if ( entity.getOrmpostid() != null ) {
            pimDistirbutionDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pimDistirbutionDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getYzzid() != null ) {
            pimDistirbutionDTO.setYzzid( entity.getYzzid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimDistirbutionDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimDistirbutionDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getSsfw() != null ) {
            pimDistirbutionDTO.setSsfw( entity.getSsfw() );
        }
        if ( entity.getEnable() != null ) {
            pimDistirbutionDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPimdistirbutionid() != null ) {
            pimDistirbutionDTO.setPimdistirbutionid( entity.getPimdistirbutionid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimDistirbutionDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimDistirbutionDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimDistirbutionDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pimDistirbutionDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimDistirbutionDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getJdzt() != null ) {
            pimDistirbutionDTO.setJdzt( entity.getJdzt() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimDistirbutionDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getYgzt() != null ) {
            pimDistirbutionDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getXb() != null ) {
            pimDistirbutionDTO.setXb( entity.getXb() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimDistirbutionDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZgcode() != null ) {
            pimDistirbutionDTO.setZgcode( entity.getZgcode() );
        }
        if ( entity.getLgnx() != null ) {
            pimDistirbutionDTO.setLgnx( entity.getLgnx() );
        }
        if ( entity.getYbmshortname() != null ) {
            pimDistirbutionDTO.setYbmshortname( entity.getYbmshortname() );
        }
        if ( entity.getZzmm() != null ) {
            pimDistirbutionDTO.setZzmm( entity.getZzmm() );
        }
        if ( entity.getYdzt() != null ) {
            pimDistirbutionDTO.setYdzt( entity.getYdzt() );
        }
        if ( entity.getNj() != null ) {
            pimDistirbutionDTO.setNj( entity.getNj() );
        }
        if ( entity.getYzzzzdzs() != null ) {
            pimDistirbutionDTO.setYzzzzdzs( entity.getYzzzzdzs() );
        }
        if ( entity.getZzdzs() != null ) {
            pimDistirbutionDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getShortname() != null ) {
            pimDistirbutionDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getOrmpostname1() != null ) {
            pimDistirbutionDTO.setOrmpostname1( entity.getOrmpostname1() );
        }

        return pimDistirbutionDTO;
    }

    @Override
    public List<PimDistirbution> toDomain(List<PimDistirbutionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimDistirbution> list = new ArrayList<PimDistirbution>( dtoList.size() );
        for ( PimDistirbutionDTO pimDistirbutionDTO : dtoList ) {
            list.add( toDomain( pimDistirbutionDTO ) );
        }

        return list;
    }

    @Override
    public List<PimDistirbutionDTO> toDto(List<PimDistirbution> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimDistirbutionDTO> list = new ArrayList<PimDistirbutionDTO>( entityList.size() );
        for ( PimDistirbution pimDistirbution : entityList ) {
            list.add( toDto( pimDistirbution ) );
        }

        return list;
    }
}
